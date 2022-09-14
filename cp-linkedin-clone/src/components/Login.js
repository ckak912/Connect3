import styled from 'styled-components'

const Login = (props) => {
        return (
            <Container>
                <Nav>
                    <a href="/">
                        <img src= "/images/Connect3Logo.png" alt="" />
                    </a>
                </Nav>
            </Container>
        );
};

const Container = styled.div`
    padding: 0px;
`;
const Nav = styled.nav`
    max-width: 1128px;
    margin: auto;
    padding: 12px 0 16px;
    paddingTop: 10000000px;
`;
export default Login;